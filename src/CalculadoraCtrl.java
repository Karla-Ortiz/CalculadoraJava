
import java.io.BufferedWriter;
import java.util.LinkedList;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.List;
import java.io.File;

/**
 *
 * @author KORTIZ
 */
public class CalculadoraCtrl {

    private List<String> historial = new LinkedList<>();

    /**
     * Opera la operación que se quiere operar xxxddd
     *
     * @param num1 primer número
     * @param num2 segundo número
     * @param operador operacion a ejecutar
     * @return resultado
     */
    public Double operar(Double num1, Double num2, String operador) {
        //se validan posibles nulos
        num1 = notNull(num1);
        num2 = notNull(num2);
        operador = notNull(operador);

        //Se agrega al historial
        addHistorial(num1.toString());
        addHistorial(num2.toString());
        addHistorial(operador);
        //Seleccion de tipo de operacion
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            case "*":
                return num1 * num2;
            case "%":
                return num1 % num2;
        }
        return 0.0;
    }

    /**
     * devuelve el historial
     *
     * @return
     */
    public List<String> getHistorial() {
        return this.historial;
    }

    /**
     * Inserta una nueva operacion al historial y la escribe en el archivo de
     * texto
     */
    public void reset() {
        addHistorial("NUEVO");
    }

    /**
     * limpia el historial y elimina el archivo txtx
     */
    public void cleanHistorial() {
        this.historial.clear();
        new File("historial.txt").delete();

    }

    /////////-------------------------METODOS PRIVADOS -------------------------------////
    private void escribirTxt(String texto) {
        try (FileWriter fw = new FileWriter("historial.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addHistorial(String op) {
        historial.add(notNull(op));
        escribirTxt(notNull(op));
    }

    private Double notNull(Double val) {
        return val != null ? val : 0.0;
    }

    private String notNull(String var) {
        return var != null ? var.trim() : "";
    }

}
