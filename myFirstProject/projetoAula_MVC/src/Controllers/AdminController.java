package Controllers;

import Models.Attraction;
import Models.Sale;
import Repositories.AttractionRepository;
import Repositories.CostRepository;
import Repositories.SaleRepository;

import java.io.FileNotFoundException;
import java.util.Scanner;


    public class AdminController {


        private SaleRepository saleRepository;
        private AttractionRepository attractionRepository;
        private CostRepository costRepository;

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
            // calcular o total de vendas de cada atração, por tipo de bilhete - iremos ter dois totais por atração: preço adulto e preço criança
            // contar a quantidade de bilhetes de cada tipo e subtrair o equivalente de custo de manutençao por cada bilhete
            // ao total final (de cada atração) subtrair também o custo fixo da atração em específico.
            return 0;
        }

        public double totalSalesAndProfitPerMonth(){
            return 0;
        }

        public Attraction mostWantedAttraction(){
            return null;
        }

        public Attraction mostWantedAttractionByAdults(){
            return null;
        }

        public Attraction mostWantedAttractionByChildren(){
            return null;
        }

        public Attraction mostProfitableAttraction(){
            return null;
        }

        public Attraction leastProfitableAttraction(){
            return null;
        }

        public Attraction bestPriceTimeAttraction(){
            return null;
        }

        public void newLogin(){}
    }


