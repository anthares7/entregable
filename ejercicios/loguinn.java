import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.swing.*;

public class loguinn {

    public static void main(String[] args) {
        mostrarVentanaLogin();
    }

    public static void mostrarVentanaLogin() {
        JFrame loginFrame = new JFrame("Login Mejorado");
        loginFrame.setSize(400, 300);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        loginFrame.add(panel);

        JLabel title = new JLabel("Inicio de Sesión");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(120, 20, 200, 30);
        panel.add(title);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(50, 80, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 80, 180, 25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setBounds(50, 120, 80, 25);
        panel.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(150, 120, 180, 25);
        panel.add(passText);

        JButton loginButton = new JButton("Ingresar");
        loginButton.setBounds(150, 180, 120, 30);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText().trim();
                String pass = new String(passText.getPassword()).trim();

                if (validarCredenciales(user, pass)) {
                    loginFrame.dispose();
                    mostrarFormularioRegistro();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginFrame.setVisible(true);
    }

    private static boolean validarCredenciales(String user, String pass) {
        return "admin".equals(user) && "1234".equals(pass);
    }

    public static void mostrarFormularioRegistro() {
        JFrame formFrame = new JFrame("Registro de Usuario");
        formFrame.setSize(450, 350);
        formFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formFrame.setLocationRelativeTo(null);
        formFrame.setLayout(null);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(50, 50, 100, 25);
        formFrame.add(nombreLabel);

        JTextField nombreField = new JTextField();
        nombreField.setBounds(150, 50, 200, 25);
        formFrame.add(nombreField);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(50, 90, 100, 25);
        formFrame.add(edadLabel);

        JTextField edadField = new JTextField();
        edadField.setBounds(150, 90, 200, 25);
        formFrame.add(edadField);

        JLabel correoLabel = new JLabel("Correo:");
        correoLabel.setBounds(50, 130, 100, 25);
        formFrame.add(correoLabel);

        JTextField correoField = new JTextField();
        correoField.setBounds(150, 130, 200, 25);
        formFrame.add(correoField);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.setBounds(150, 180, 100, 30);
        formFrame.add(guardarButton);

        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText().trim();
                String edadStr = edadField.getText().trim();
                String correo = correoField.getText().trim();

                if (validarCampos(nombre, edadStr, correo)) {
                    guardarUsuario(nombre, edadStr, correo);
                    limpiarCampos(nombreField, edadField, correoField);
                }
            }
        });

        JButton verUsuariosButton = new JButton("Ver Usuarios");
        verUsuariosButton.setBounds(150, 230, 120, 30);
        formFrame.add(verUsuariosButton);

        verUsuariosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarUsuariosRegistrados();
            }
        });

        formFrame.setVisible(true);
    }

    private static boolean validarCampos(String nombre, String edadStr, String correo) {
        if (nombre.isEmpty() || edadStr.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            int edad = Integer.parseInt(edadStr);
            if (edad <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Edad inválida. Debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Correo inválido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private static void guardarUsuario(String nombre, String edad, String correo) {
        try (FileWriter writer = new FileWriter("usuarios_mejorados.txt", true)) {
            writer.write(nombre + " - " + edad + " - " + correo + "\n");
            JOptionPane.showMessageDialog(null, "Usuario guardado correctamente");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void limpiarCampos(JTextField... fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }

    private static void mostrarUsuariosRegistrados() {
        try {
            File archivo = new File("usuarios_mejorados.txt");

            if (!archivo.exists()) {
                JOptionPane.showMessageDialog(null, "No hay usuarios registrados todavía.");
                return;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()), StandardCharsets.UTF_8);

            JFrame ventanaUsuarios = new JFrame("Usuarios Registrados");
            ventanaUsuarios.setSize(500, 400);
            ventanaUsuarios.setLocationRelativeTo(null);

            JTextArea textArea = new JTextArea(contenido);
            textArea.setEditable(false);

            JScrollPane scroll = new JScrollPane(textArea);
            ventanaUsuarios.add(scroll);
            ventanaUsuarios.setVisible(true);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}