class Army {

    public static void createArmy() {
        // Create all objects here
        Knight knightA = new Knight("123");
        Knight knightB = new Knight("12312");
        Knight knightC = new Knight("123123");
        Unit unitA = new Unit("123");
        Unit unitB = new Unit("123");
        Unit unitC = new Unit("123");
        Unit unitD = new Unit("123");
        Unit unitE = new Unit("123");
        General generalA = new General("123");
        Doctor DoctorA = new Doctor("1231423");
        if (knightA.equals(knightC) || knightB.equals(knightA) || knightC.equals(knightA))
            System.out.print("");
        if (unitA.equals(unitC) || knightB.equals(knightA) || knightC.equals(knightA))
            System.out.print("");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}