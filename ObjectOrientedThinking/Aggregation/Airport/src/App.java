public class App {
    public static void main(String[] args) throws Exception {
        CrewMember cm1 = new CrewMember("Jenny");
        CrewMember cm2 = new CrewMember("David");
        CrewMember[] cmembers = new CrewMember[5];
        cmembers[0] = cm1;
        cmembers[1] = cm2;

        {
            Aeroplane emirates = new Aeroplane();
            emirates.setCrewMember(cmembers);

        }
        System.out.println(cm1.getName());

    }
}
