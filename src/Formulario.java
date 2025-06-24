import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
    private JPanel principal;
    private JTextField nombre;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField nota1textField;
    private JTextField nota2textField;
    private JTextField nota3textField;
    private JTextField textField7;
    private JButton limpiar;
    private JButton calcular;
    private JLabel apellido;
    private JLabel edad;
    private JLabel notas;
    private JLabel primera;
    private JLabel segunda;
    private JLabel tercera;

    public Formulario() {

        setTitle("Notas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        setLocationRelativeTo(null);
        setVisible(true);


        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //apellido.setText(nombre.getText());
                double nota = calcular();
                JOptionPane.showMessageDialog(null, nota, "Nota final", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre.setText("");
                textField2.setText("");
                textField3.setText("");
                nota1textField.setText("");
                nota2textField.setText("");
                nota3textField.setText("");
                textField7.setText("");

            }
        });
    }

    public double calcular() {
        try {
            double nota1 = Double.parseDouble(nota1textField.getText());
            double nota2 = Double.parseDouble(nota2textField.getText());
            double nota3 = Double.parseDouble(nota3textField.getText());

            if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
                double promedio = (nota1 + nota2 + nota3) / 3;
                return promedio;
            } else {
                JOptionPane.showMessageDialog(null, "Una o más notas están fuera del rango válido (0 a 10)", "Error", JOptionPane.ERROR_MESSAGE);
                return -1; // Valor indicativo de error
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
            return -1; // Valor indicativo de error
        }
    }


    public static void main(String[] args) {
        Formulario dialog = new Formulario();
        dialog.setVisible(true);

    }

}
