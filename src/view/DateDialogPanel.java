package view;

//import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.JPanel;
import view.DateDialog;

public class DateDialogPanel extends JPanel implements DateDialog {

    private Date date;

    public DateDialogPanel() {
        super(new FlowLayout(FlowLayout.LEFT));
        date = new Date();
    }

    @Override
    public void show() {
    }
  

    @Override
    public Date getDate() {
        return date;
    }

}