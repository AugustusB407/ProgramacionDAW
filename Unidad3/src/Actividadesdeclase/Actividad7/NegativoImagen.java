package Unidad3.src.Actividadesdeclase.Actividad7;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class NegativoImagen {
    public static void main(String[] args) {

        // Rutas de entrada y salida
        String rutaEntrada = "C:\\Users\\MSI\\Desktop\\ProgramacionDAW-main\\Unidad3\\src\\Actividadesdeclase\\Actividad7\\images.jpg";
        String rutaSalida = "C:\\Users\\MSI\\Desktop\\ProgramacionDAW-main\\Unidad3\\src\\Actividadesdeclase\\Actividad7\\negativo.png";
        try {
            // Leer imagen JPEG
            BufferedImage imagenColor = ImageIO.read(new File(rutaEntrada));
            if (imagenColor == null) {
                System.out.println("No se pudo leer la imagen. Verifica la ruta y el archivo.");
                return;
            }
            // Crear una imagen nueva en color (antes era TYPE_BYTE_GRAY)
            BufferedImage imagenNegativo = new BufferedImage(
                    imagenColor.getWidth(),
                    imagenColor.getHeight(),
                    BufferedImage.TYPE_INT_RGB
            );
            // Convertir pixel por pixel
            for (int y = 0; y < imagenColor.getHeight(); y++) {
                for (int x = 0; x < imagenColor.getWidth(); x++) {
                    Color color = new Color(imagenColor.getRGB(x, y));
                    // Negativo: 255 - cada componente RGB
                    int rojo = 255 - color.getRed();
                    int verde = 255 - color.getGreen();
                    int azul = 255 - color.getBlue();
                    int nuevoColor = new Color(rojo, verde, azul).getRGB();
                    imagenNegativo.setRGB(x, y, nuevoColor);
                }
            }
            // Guardar como PNG
            boolean resultado = ImageIO.write(imagenNegativo, "png", new File(rutaSalida));
            if (resultado) {
                System.out.println("Conversión completada: imagen en negativo guardada como " + rutaSalida);
            } else {
                System.out.println("No fue posible guardar la imagen.");
            }
        } catch (IOException e) {
            System.err.println("Error al leer o escribir la imagen: " + e.getMessage());
        }
    }
}
