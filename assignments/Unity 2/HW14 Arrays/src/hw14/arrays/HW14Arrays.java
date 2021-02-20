/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14.arrays;

/**
 *
 * @author Pc
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n"
                + "|             UNIVERSIDAD DE LAS FUERZAS ARMADAS              |\n"
                + "|                         (ESPE)                              |\n"
                + "| Programming Fundamentals                                    |\n"
                + "| Programer: ERICK OCHOA                                      |\n"
                + "| WS14 Arrays                                                 |\n"
                + "| Arrays of Ecudor                                            |\n"
                + "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        String[] provincesOfEcuador = {"Galápagos", "Esmeraldas", "Manabí", "Los Ríos", "Santa Elena", "Guayas", "Santo Domingo de los Tsachilas"
            + "Azuay", "Bolivar", "Cañar", "Carchi", "Cotopaxi", "Chimborazo", "Imbabura", "Loja", "Pichincha", "Tungurahua"
            + "Morona Santiago", "Napo", "Orellana", "Pastaza", "Sucumbíos", "Zamora Chinchipe "};
        String[] principalsCitiesOfEcuador = {"Quito", "Guayaquil", "Cuenca", "Ibarra", "Manta", "Loja", "Ambato", "Riobamba", "Machala"};
        String[] regionsOfEcuador = {"Coast region", "Sierra region", "Amazon region", "Insular region"};

        System.out.println("PROVINCES NAMES OF ECUADOR");
        for (String provinces : provincesOfEcuador) {
            System.out.println("provinces names of Ecuador -> " + provinces);
        }
        System.out.println("PRINCIPAL CITIES OF ECUADOR ");
        for (String cities : principalsCitiesOfEcuador) {
            System.out.println(" principals cities of Ecuador -> " + cities);

        }
        System.out.println("THE REGIONS OF ECUADOR ARE ->");
        for (String regions : regionsOfEcuador) {
            System.out.println("The regions of Ecuador are ->" + regions);
        }
    }
}
