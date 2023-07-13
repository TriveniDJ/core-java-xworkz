class TelecomTester {
    public static void main(String city[]) {
        Telecom.addSim("jio");
        Telecom.addSim("Airtel");
        Telecom.addSim("vadafone");
        Telecom.addSim("BSNL");
        Telecom.addSim("idea");
        Telecom.getAllSim();

        boolean value = Telecom.updateSimName("jio", "jio infocom limited");
        System.out.println(value);
        boolean value1 = Telecom.updateSimName("Airtel", "airtel pvt ltd");
        System.out.println(value1);
        boolean value2 = Telecom.updateSimName("vadafone", "vodafone");
        System.out.println(value2);
        boolean value3 = Telecom.updateSimName("BSNL", "bsnl");
        System.out.println(value3);
        boolean value4 = Telecom.updateSimName("idea", "IDEA");
        System.out.println(value4);
        Telecom.getAllSim();

        boolean deleteValue = Telecom.deleteSim("jio infocom limited");
        System.out.println(deleteValue);
        Telecom.getAllSimPostDeletion();
    }
}