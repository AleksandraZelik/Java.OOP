package homework11;

import homework6.*;

import java.util.*;

public class FigureSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Figure> figures = new ArrayList<>();
        boolean cont = true;
        while (cont) {
            System.out.println("Яку фігуру додати? Якщо ви бажаєте додати трикутник, введіть 1. Якщо " +
                    "бажаєте додати коло, введіть 2. Якщо бажаєте додати рівнобедренний трикутник, введіть 3. " +
                    "Якщо бажаєте додати квадрат, введіть 4.");
            int figure = sc.nextInt();
            if (figure == 1) {
                System.out.println("Введіть параметри фігури: сторона 1");
                double leg1 = sc.nextDouble();
                System.out.println("Введіть параметри фігури: сторона 2");
                double leg2 = sc.nextDouble();
                System.out.println("Введіть параметри фігури: сторона 3");
                double basic = sc.nextDouble();

                figures.add(new Triangle(leg1, leg2, basic));

            } else if (figure == 2) {
                System.out.println("Введіть параметри фігури: радіус");
                int radius = sc.nextInt();

                figures.add(new Circle(radius));

            } else if (figure == 3) {
                System.out.println("Введіть параметри фігури: сторона 1");
                double leg1 = sc.nextDouble();
                System.out.println("Введіть параметри фігури: сторона 2");
                double basic = sc.nextDouble();

                figures.add(new IsoscelesTriangle(leg1, basic));

            } else if (figure == 4) {
                System.out.println("Введіть параметри фігури: сторона 1");
                double side1 = sc.nextDouble();

                figures.add(new Quadrant(side1));
            }

            System.out.println("Чи хочете додати ще одну фігуру? Якщо так, введіть yes. Якщо нi, введіть no");
            String answer = sc.next();
            if (answer.equals("yes"))
                cont = true;
            else cont = false;
        }

        Collections.sort(figures, new Comparator<Figure>() {
            @Override
            public int compare(Figure f1, Figure f2) {
                int result = Double.compare(f1.square(), f2.square());
                if (result == 0) {
                    result = Double.compare(f1.perimeter(), f2.perimeter());
                }
                return result;
            }
        });
        System.out.println("=========== Figure list =============");
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i));
        }
    }
}

