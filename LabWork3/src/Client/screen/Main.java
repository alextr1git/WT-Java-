package client.screen;

import client.logic.entity.Role;
import client.logic.entity.Student;

import java.util.Scanner;

public class Main {
    private static final Presenter presenter = new Presenter();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter of operation: ");
        switch (in.nextInt()) {
            case 1:
                presenter.connect("Vladislav", "2002");
                break;
            case 2:
                presenter.create(new Student("Vladislav", "Fedukevich", "Dmitrievuch", "24/08/20032, 051005, 2002, Role.USER));
                break;
            case 3:
                presenter.read(1445);
                break;
            case 4:
                presenter.update(new Student("Vladislav", "Fedukevich", "Dmitrievuch", "24/08/20032, 051005, 2002, Role.USER));
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}
