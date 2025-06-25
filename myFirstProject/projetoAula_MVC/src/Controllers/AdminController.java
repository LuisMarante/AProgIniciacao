package Controllers;

import Models.Attraction;
import Models.Sale;
import Repositories.AttractionRepository;
import Repositories.SaleRepository;

import java.io.FileNotFoundException;

public class AdminController {

        private SaleRepository saleRepository;
        private AttractionRepository attractionRepository;

        public AdminController() throws FileNotFoundException {
            this.saleRepository = new SaleRepository();
            this.attractionRepository = new AttractionRepository();
        }

        public double totalSalesValue() {
            double totalSalesValue = 0;
            for (Sale currentSale : this.saleRepository.getSalesArray()) {
                for (Attraction currentAttraction : this.attractionRepository.getAttractionsArrayList()) {
                    if (currentSale.getIdAttraction() == currentAttraction.getIdAttraction()) {
                        switch (currentSale.getClientType()) {
                            case "adulto":
                                totalSalesValue += currentAttraction.getAdultPrice();
                                break;

                            case "crianca":
                                totalSalesValue += currentAttraction.getChildrenPrice();
                                break;
                        }
                    }
                }
            }
            return totalSalesValue;
        }

        public double totalProfit(){
        }

        public double totalSalesAndProfitPerMonth(){
        }

        public Attraction mostWantedAttraction(){

        }

        public Attraction mostWantedAttractionByAdults(){

            

        }

        public Attraction mostWantedAttractionByChildren(){
        }

        public Attraction mostProfitableAttraction(){
        }

        public Attraction leastProfitableAttraction(){
        }

        public Attraction bestPriceTimeAttraction(){
        }

        public void newLogin(){
        }
}
