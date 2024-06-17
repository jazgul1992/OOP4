import java.util.List;

public class TeacherView <T extends Teacher> {

    void sendOnConsole(List<T>teachers){
        for (T teacher : teachers) {
            System.out.println(teacher);
        }
    }
}