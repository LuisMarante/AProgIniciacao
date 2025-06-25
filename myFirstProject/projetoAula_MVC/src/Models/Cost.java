package Models;

public class Cost {


        private int idAttraction;
        private double costMaintenanceTicket;
        private double fixedCostMonth;

        /**
         * Constructor Method
         *
         * @param id
         * @param costMaintenanceTicket
         * @param fixedCostMonth
         */
        public Cost(int id, double costMaintenanceTicket, double fixedCostMonth) {
            this.idAttraction = idAttraction;
            this.costMaintenanceTicket = costMaintenanceTicket;
            this.fixedCostMonth = fixedCostMonth;
        }

        public int getIdAttraction() {
            return idAttraction;
        }

        public double getGostMaintenanceTicket() {
            return costMaintenanceTicket;
        }

        public double getFixedCostMonth() {
            return fixedCostMonth;
        }

        /**
         * Override Method
         * @return The details that will be displayed in the console
         */
        @Override
        public String toString() {
            return "Custo de Manutenção Bilhete: " + costMaintenanceTicket + " | " + "Custo Fixo Mês: " + fixedCostMonth + " | ";
        }
    }




