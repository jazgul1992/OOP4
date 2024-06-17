public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        controller.create("Sagynova","Bermet", "Ulanbekovna");
        controller.create("Syrymbenova","Burul", "Syrymbetovna");
        controller.create("Zholdubaev", "Nurbek", "Tilekbekovich");
        controller.create("Kazakbaeva", "Aziza", "Aldaeyrbekovna");
        controller.create("Nurdinova", "Nurila", "Maksatbekovna");
        controller.printTeacherList();
        controller.change(3, "Apsatarova", "Nurgul", "Zhakshylykovna");
        System.out.println();
        controller.printTeacherList();
        System.out.println();
        controller.printSortedTeacherList();
    }
}