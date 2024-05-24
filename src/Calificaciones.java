public class Calificaciones {

    private String nombre;
    private double[] calificaciones;

    public Calificaciones(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal() {
        double promedio = calcularPromedio();
        if (promedio >= 90) {
            return 'A';
        } else if (promedio >= 80) {
            return 'B';
        } else if (promedio >= 70) {
            return 'C';
        } else if (promedio >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPromedio: " + calcularPromedio() + "\nCalificación Final: " + obtenerCalificacionFinal();
    }

    public static void main(String[] args) {
        Calificaciones alumno1 = new Calificaciones("Juan Perez", new double[]{85, 92, 88, 95, 90});
        Calificaciones alumno2 = new Calificaciones("Alan Gerez", new double[]{78, 85, 77, 82, 81});
        Calificaciones alumno3 = new Calificaciones("Eduardo Aparicio", new double[]{98, 87, 93, 96, 94});
        Calificaciones alumno4 = new Calificaciones("Rigoberto Luna", new double[]{75, 82, 71, 84, 79});
        Calificaciones alumno5 = new Calificaciones("Kevin Mandujano", new double[]{68, 75, 66, 72, 70});

        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
        System.out.println(alumno5);
    }
}
