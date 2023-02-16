package HomeWorks.HomeWorks012;

import HomeWorks.HomeWorks012.models.Zoo;
import HomeWorks.HomeWorks012.views.View;
import HomeWorks.HomeWorks012.views.ConsoleView;
import HomeWorks.HomeWorks012.presenters.Presenter;

public class Program {
    public static void main(String[] args) {
        Zoo Zoo = new Zoo();
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Zoo);
        presenter.Open();
    }
}
