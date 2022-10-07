package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();

    public void ConvertirMonedas(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos Argentinos a Dólar","De Pesos Argentinos a Euro","De Pesos Argentinos a Libras","De Pesos Argentinos a Yen","De Pesos Argentinos a Won Coreano","De Pesos Argentinos a Pesos Uruguayos","De Dólar a Pesos Argentinos","De Euro a Pesos Argentinos","De Libras a Pesos Argentinos","De Yen a Pesos Argentinos","De Won Coreano a Pesos Argentinos","De Pesos Uruguayos a Pesos Argentinos"},
                "Seleccion")).toString();
        switch (opcion) {
            case "De Pesos Argentinos a Dólar":
                monedas.ConvertirPesosArgentinosADolares(Minput);
                break;
            case "De Pesos Argentinos a Euro":
                monedas.ConvertirPesosAEuros(Minput);
                break;
            case "De Pesos Argentinos a Libras":
                monedas.ConvertirPesosALibras(Minput);
                break;
            case "De Pesos Argentinos a Yen":
                monedas.ConvertirPesosAYen(Minput);
                break;
            case "De Pesos Argentinos a Won Coreano":
                monedas.ConvertirPesosAWon(Minput);
                break;
            case "De Pesos Argentinos a Pesos Uruguayos":
                monedas.ConvertirPesosAWon(Minput);
                break;
            case "De Dólar a Pesos Argentinos":
                pesos.ConvertirDolaresAPesosArgentinos(Minput);
                break;
            case "De Euro a Pesos Argentinos":
                pesos.ConvertirEurosAPesosArgentinos(Minput);
                break;
            case "De Libras a Pesos Argentinos":
                pesos.ConvertirLibrasAPesosArgentinos(Minput);
                break;
            case "De Yen a Pesos Argentinos":
                pesos.ConvertirYenAPesosArgentinos(Minput);
                break;
            case "De Won Coreano a Pesos Argentinos":
                pesos.ConvertirWonAPesosArgentinos(Minput);
                break;
            case "De Pesos Uruguayos a Pesos Argentinos":
                pesos.ConvertirWonAPesosArgentinos(Minput);
                break;
        }
    }

}
