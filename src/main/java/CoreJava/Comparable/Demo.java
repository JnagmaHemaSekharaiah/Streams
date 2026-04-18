package CoreJava.Comparable;

import com.pratice.MethodRefer.orbitary.Student;

public class Demo implements Comparable<Demo>
{

    int age;

    @Override
    public int compareTo(Demo x) {

        return  Integer.compare(this.age,x.age);
    }
}
