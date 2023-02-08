package HomeWorks.HomeWorks011.Client;

import java.util.Scanner;

import HomeWorks.HomeWorks011.Core.Infrastructure.PhoneBook;
import HomeWorks.HomeWorks011.Core.MVP.Presenter;
import HomeWorks.HomeWorks011.UI.App;
import HomeWorks.HomeWorks011.UI.ConsoleView;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        App app = new App(new Presenter(new ConsoleView(scan), new PhoneBook()));
        app.Open();
    }
}
