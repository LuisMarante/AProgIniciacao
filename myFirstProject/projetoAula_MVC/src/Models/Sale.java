package Models;

public class Sale {


        private int idAttraction;
        private int monthDate;
        private int yearDate;
        private String clientType;

        public Sale(int idAttraction, int monthDate, int yearDate, String clientType) {
            this.idAttraction = idAttraction;
            this.monthDate = monthDate;
            this.yearDate = yearDate;
            this.clientType = clientType;
        }

        public int getIdAttraction() {
            return idAttraction;
        }

        public int getMonthDate() {
            return monthDate;
        }

        public int getYearDate() {
            return yearDate;
        }

        public String getClientType() {
            return clientType;
        }

        @Override
        public String toString() {
            return  "Data Venda: " + monthDate + "/" + yearDate + " | Tipo de Cliente: " + clientType;
        }
    }


