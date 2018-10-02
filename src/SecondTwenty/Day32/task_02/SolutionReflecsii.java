package SecondTwenty.Day32.task_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Aleksandr_Svibovich on 10/2/2018.
 */
public class SolutionReflecsii {
    public static void main(String[] args) {
        Class cl = TestSeven.class;
        try {
            getDataAll(cl);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private static void getDataAll(Class cl) throws NoSuchMethodException {
        Field[] fields = cl.getDeclaredFields();
        Constructor constr = cl.getDeclaredConstructor();
        Method[] methods = cl.getDeclaredMethods();

        String name1 = constr.getName();
        String modifier1 = Modifier.toString(constr.getModifiers());
        Class[] paramTypes = constr.getParameterTypes();
        for (Class c:paramTypes) {
            System.out.println("param types " + c.getName());
        }
        System.out.println("Modifier " + modifier1 + " Constructor " + name1);

        for (Method m : methods) {
            Class type = m.getReturnType();
            String name = m.getName();
            String modifier = Modifier.toString(m.getModifiers());
            System.out.println("Method :" + modifier + " Type " + type + "; Name " + name);
        }

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            String modifier = Modifier.toString(f.getModifiers());
            System.out.println("Modifier :" + modifier + " Type " + type + "; Name " + name);
        }
    }
}
