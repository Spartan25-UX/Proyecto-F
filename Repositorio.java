import javax.swing.*;

public class Repositorio{
    public static void main (String[] args){
        JFrame frame = new JFrame("Proyecto F");
        //Tamano de mi ventana
        frame.setSize(400, 400);
        //De ley supuestamente lo lleva
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        //Lo que llevara mi ventana
        JLabel textoJLabel = new JLabel("holaa");
        JButton cerrarJButton = new JButton("cerrar");

        //ubicar las etiquetas
        textoJLabel.setBounds(50, 80, 40, 30);
        cerrarJButton.setBounds(50, 110, 80, 30);

        //Agregar los componentes a la ventana
        frame.add(textoJLabel);
        frame.add(cerrarJButton);

        //Para que se muestre mi frame
        frame.setVisible(true);

    }

}