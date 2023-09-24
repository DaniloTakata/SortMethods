package codigo;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.util.Random;

public class OrdenacaoVetor {

    public static void main(String [] args) {



        int[] array30 = geraArray(30);
        int[] array50 = geraArray(50);
        int[] array100 = geraArray(100);
        int[] array200 = geraArray(200);
        int[] array1000 = geraArray(1000);
        int[] array10000 = geraArray(10000);
        int[] array100000 = geraArray(100000);

        AlgoritmoOrdenacao bubble = new AlgoritmoOrdenacao("Bubble");
        AlgoritmoOrdenacao quick = new AlgoritmoOrdenacao("Quick");
        AlgoritmoOrdenacao selection = new AlgoritmoOrdenacao("Selection");
        AlgoritmoOrdenacao insertion = new AlgoritmoOrdenacao("Insertion");

        try {

            int[] array30Bubble = copiaArray(array30);
            long inicioBubble30 = System.currentTimeMillis();
            bubbleSort(array30Bubble);
            long fimBubble30 = System.currentTimeMillis();


            int[] array30Quick = copiaArray(array30);
            long inicioQuick30 = System.currentTimeMillis();
            quickSort(array30Quick, 0, (array30Quick.length - 1));
            long fimQuick30 = System.currentTimeMillis();

            int[] array30Selection = copiaArray(array30);
            long inicioSelection30 = System.currentTimeMillis();
            selecaoSort(array30Selection);
            long fimSelection30 = System.currentTimeMillis();

            int[] array30Insertion = copiaArray(array30);
            long inicioInsertion30 = System.currentTimeMillis();
            insercaoSort(array30Insertion);
            long fimInsertion30 = System.currentTimeMillis();

            System.out.printf("\nTempo Bubble 30: %d (ms)", (fimBubble30 - inicioBubble30));
            System.out.printf("\nTempo Quick 30: %d (ms)", (fimQuick30 - inicioQuick30));
            System.out.printf("\nTempo Selection 30: %d (ms)", (fimSelection30 - inicioSelection30));
            System.out.printf("\nTempo Insertion 30: %d (ms)", (fimInsertion30 - inicioInsertion30));

            bubble.setTempo30(fimBubble30 - inicioBubble30);
            quick.setTempo30(fimQuick30 - inicioQuick30);
            selection.setTempo30(fimSelection30 - inicioSelection30);
            insertion.setTempo30(fimInsertion30 - inicioInsertion30);

            // ------------------------------------------------------------------------

            int[] array50Bubble = copiaArray(array50);
            long inicioBubble50 = System.currentTimeMillis();
            bubbleSort(array50Bubble);
            long fimBubble50 = System.currentTimeMillis();

            int[] array50Quick = copiaArray(array50);
            long inicioQuick50 = System.currentTimeMillis();
            quickSort(array50Quick, 0, (array50Quick.length - 1));
            long fimQuick50 = System.currentTimeMillis();

            int[] array50Selection = copiaArray(array50);
            long inicioSelection50 = System.currentTimeMillis();
            selecaoSort(array50Selection);
            long fimSelection50 = System.currentTimeMillis();

            int[] array50Insertion = copiaArray(array50);
            long inicioInsertion50 = System.currentTimeMillis();
            insercaoSort(array50Insertion);
            long fimInsertion50 = System.currentTimeMillis();

            System.out.printf("\n\nTempo Bubble 50: %d (ms)", (fimBubble50 - inicioBubble50));
            System.out.printf("\nTempo Quick 50: %d (ms)", (fimQuick50 - inicioQuick50));
            System.out.printf("\nTempo Selection 50: %d (ms)", (fimSelection50 - inicioSelection50));
            System.out.printf("\nTempo Insertion 50: %d (ms)", (fimInsertion50 - inicioInsertion50));

            bubble.setTempo50(fimBubble50 - inicioBubble50);
            quick.setTempo50(fimQuick50 - inicioQuick50);
            selection.setTempo50(fimSelection50 - inicioSelection50);
            insertion.setTempo50(fimInsertion50 - inicioInsertion50);

            // ------------------------------------------------------------------------

            int[] array100Bubble = copiaArray(array100);
            long inicioBubble100 = System.currentTimeMillis();
            bubbleSort(array100Bubble);
            long fimBubble100 = System.currentTimeMillis();

            int[] array100Quick = copiaArray(array100);
            long inicioQuick100 = System.currentTimeMillis();
            quickSort(array100Quick, 0, (array100Quick.length - 1));
            long fimQuick100 = System.currentTimeMillis();

            int[] array100Selection = copiaArray(array100);
            long inicioSelection100 = System.currentTimeMillis();
            selecaoSort(array100Selection);
            long fimSelection100 = System.currentTimeMillis();

            int[] array100Insertion = copiaArray(array100);
            long inicioInsertion100 = System.currentTimeMillis();
            insercaoSort(array100Insertion);
            long fimInsertion100 = System.currentTimeMillis();

            System.out.printf("\n\nTempo Bubble 100: %d (ms)", (fimBubble100 - inicioBubble100));
            System.out.printf("\nTempo Quick 100: %d (ms)", (fimQuick100 - inicioQuick100));
            System.out.printf("\nTempo Selection 100: %d (ms)", (fimSelection100 - inicioSelection100));
            System.out.printf("\nTempo Insertion 100: %d (ms)", (fimInsertion100 - inicioInsertion100));

            bubble.setTempo100(fimBubble100 - inicioBubble100);
            quick.setTempo100(fimQuick100 - inicioQuick100);
            selection.setTempo100(fimSelection100 - inicioSelection100);
            insertion.setTempo100(fimInsertion100 - inicioInsertion100);

            // ------------------------------------------------------------------------

            int[] array200Bubble = copiaArray(array200);
            long inicioBubble200 = System.currentTimeMillis();
            bubbleSort(array200Bubble);
            long fimBubble200 = System.currentTimeMillis();

            int[] array200Quick = copiaArray(array200);
            long inicioQuick200 = System.currentTimeMillis();
            quickSort(array200Quick, 0, (array200Quick.length - 1));
            long fimQuick200 = System.currentTimeMillis();

            int[] array200Selection = copiaArray(array200);
            long inicioSelection200 = System.currentTimeMillis();
            selecaoSort(array200Selection);
            long fimSelection200 = System.currentTimeMillis();

            int[] array200Insertion = copiaArray(array200);
            long inicioInsertion200 = System.currentTimeMillis();
            insercaoSort(array200Insertion);
            long fimInsertion200 = System.currentTimeMillis();

            System.out.printf("\n\nTempo Bubble 200: %d (ms)", (fimBubble200 - inicioBubble200));
            System.out.printf("\nTempo Quick 200: %d (ms)", (fimQuick200 - inicioQuick200));
            System.out.printf("\nTempo Selection 200: %d (ms)", (fimSelection200 - inicioSelection200));
            System.out.printf("\nTempo Insertion 200: %d (ms)", (fimInsertion200 - inicioInsertion200));

            bubble.setTempo200(fimBubble200 - inicioBubble200);
            quick.setTempo200(fimQuick200 - inicioQuick200);
            selection.setTempo200(fimSelection200 - inicioSelection200);
            insertion.setTempo200(fimInsertion200 - inicioInsertion200);

            // ------------------------------------------------------------------------

            int[] array1000Bubble = copiaArray(array1000);
            long inicioBubble1000 = System.currentTimeMillis();
            bubbleSort(array1000Bubble);
            long fimBubble1000 = System.currentTimeMillis();

            int[] array1000Quick = copiaArray(array1000);
            long inicioQuick1000 = System.currentTimeMillis();
            quickSort(array1000Quick, 0, (array1000Quick.length - 1));
            long fimQuick1000 = System.currentTimeMillis();

            int[] array1000Selection = copiaArray(array1000);
            long inicioSelection1000 = System.currentTimeMillis();
            selecaoSort(array1000Selection);
            long fimSelection1000 = System.currentTimeMillis();

            int[] array1000Insertion = copiaArray(array1000);
            long inicioInsertion1000 = System.currentTimeMillis();
            insercaoSort(array1000Insertion);
            long fimInsertion1000 = System.currentTimeMillis();

            System.out.printf("\n\nTempo Bubble 1000: %d (ms)", (fimBubble1000 - inicioBubble1000));
            System.out.printf("\nTempo Quick 1000: %d (ms)", (fimQuick1000 - inicioQuick1000));
            System.out.printf("\nTempo Selection 1000: %d (ms)", (fimSelection1000 - inicioSelection1000));
            System.out.printf("\nTempo Insertion 1000: %d (ms)", (fimInsertion1000 - inicioInsertion1000));

            bubble.setTempo1000(fimBubble1000 - inicioBubble1000);
            quick.setTempo1000(fimQuick1000 - inicioQuick1000);
            selection.setTempo1000(fimSelection1000 - inicioSelection1000);
            insertion.setTempo1000(fimInsertion1000 - inicioInsertion1000);

            // ------------------------------------------------------------------------

            int[] array10000Bubble = copiaArray(array10000);
            long inicioBubble10000 = System.currentTimeMillis();
            bubbleSort(array10000Bubble);
            long fimBubble10000 = System.currentTimeMillis();

            int[] array10000Quick = copiaArray(array10000);
            long inicioQuick10000 = System.currentTimeMillis();
            quickSort(array10000Quick, 0, (array10000Quick.length - 1));
            long fimQuick10000 = System.currentTimeMillis();

            int[] array10000Selection = copiaArray(array10000);
            long inicioSelection10000 = System.currentTimeMillis();
            selecaoSort(array10000Selection);
            long fimSelection10000 = System.currentTimeMillis();

            int[] array10000Insertion = copiaArray(array10000);
            long inicioInsertion10000 = System.currentTimeMillis();
            insercaoSort(array10000Insertion);
            long fimInsertion10000 = System.currentTimeMillis();

            System.out.printf("\n\nTempo Bubble 10000: %d (ms)", (fimBubble10000 - inicioBubble10000));
            System.out.printf("\nTempo Quick 10000: %d (ms)", (fimQuick10000 - inicioQuick10000));
            System.out.printf("\nTempo Selection 10000: %d (ms)", (fimSelection10000 - inicioSelection10000));
            System.out.printf("\nTempo Insertion 10000: %d (ms)", (fimInsertion10000 - inicioInsertion10000));

            bubble.setTempo10000(fimBubble10000 - inicioBubble10000);
            quick.setTempo10000(fimQuick10000 - inicioQuick10000);
            selection.setTempo10000(fimSelection10000 - inicioSelection10000);
            insertion.setTempo10000(fimInsertion10000 - inicioInsertion10000);

            // ------------------------------------------------------------------------

            int[] array100000Bubble = copiaArray(array100000);
            long inicioBubble100000 = System.currentTimeMillis();
            bubbleSort(array100000Bubble);
            long fimBubble100000 = System.currentTimeMillis();

            int[] array100000Quick = copiaArray(array100000);
            long inicioQuick100000 = System.currentTimeMillis();
            quickSort(array100000Quick, 0, (array100000Quick.length - 1));
            long fimQuick100000 = System.currentTimeMillis();

            int[] array100000Selection = copiaArray(array100000);
            long inicioSelection100000 = System.currentTimeMillis();
            selecaoSort(array100000Selection);
            long fimSelection100000 = System.currentTimeMillis();

            int[] array100000Insertion = copiaArray(array100000);
            long inicioInsertion100000 = System.currentTimeMillis();
            insercaoSort(array100000Insertion);
            long fimInsertion100000 = System.currentTimeMillis();

            System.out.printf("\n\nTempo Bubble 100000: %d (ms)", (fimBubble100000 - inicioBubble100000));
            System.out.printf("\nTempo Quick 100000: %d (ms)", (fimQuick100000 - inicioQuick100000));
            System.out.printf("\nTempo Selection 100000: %d (ms)", (fimSelection100000 - inicioSelection100000));
            System.out.printf("\nTempo Insertion 100000: %d (ms)", (fimInsertion100000 - inicioInsertion100000));

            bubble.setTempo100000(fimBubble100000 - inicioBubble100000);
            quick.setTempo100000(fimQuick100000 - inicioQuick100000);
            selection.setTempo100000(fimSelection100000 - inicioSelection100000);
            insertion.setTempo100000(fimInsertion100000 - inicioInsertion100000);

            // ------------------------------------------------------------------------

            System.out.println("\n\n" + bubble.toString());
            System.out.println(quick.toString());
            System.out.println(selection.toString());
            System.out.println(insertion.toString());

            System.out.println("\n\n");

            DefaultCategoryDataset  dataset = new DefaultCategoryDataset();

            dataset.addValue(bubble.getTempo30(), "Bubble", "30");
            dataset.addValue(bubble.getTempo50(), "Bubble", "50");
            dataset.addValue(bubble.getTempo100(), "Bubble", "100");
            dataset.addValue(bubble.getTempo200(), "Bubble", "200");
            dataset.addValue(bubble.getTempo1000(), "Bubble", "1000");
            dataset.addValue(bubble.getTempo10000(), "Bubble", "10000");
            dataset.addValue(bubble.getTempo100000(), "Bubble", "100000");

            dataset.addValue(quick.getTempo30(), "Quick", "30");
            dataset.addValue(quick.getTempo50(), "Quick", "50");
            dataset.addValue(quick.getTempo100(), "Quick", "100");
            dataset.addValue(quick.getTempo200(), "Quick", "200");
            dataset.addValue(quick.getTempo1000(), "Quick", "1000");
            dataset.addValue(quick.getTempo10000(), "Quick", "10000");
            dataset.addValue(quick.getTempo100000(), "Quick", "100000");

            dataset.addValue(selection.getTempo30(), "Selection", "30");
            dataset.addValue(selection.getTempo50(), "Selection", "50");
            dataset.addValue(selection.getTempo100(), "Selection", "100");
            dataset.addValue(selection.getTempo200(), "Selection", "200");
            dataset.addValue(selection.getTempo1000(), "Selection", "1000");
            dataset.addValue(selection.getTempo10000(), "Selection", "10000");
            dataset.addValue(selection.getTempo100000(), "Selection", "100000");

            dataset.addValue(insertion.getTempo30(), "Insertion", "30");
            dataset.addValue(insertion.getTempo50(), "Insertion", "50");
            dataset.addValue(insertion.getTempo100(), "Insertion", "100");
            dataset.addValue(insertion.getTempo200(), "Insertion", "200");
            dataset.addValue(insertion.getTempo1000(), "Insertion", "1000");
            dataset.addValue(insertion.getTempo10000(), "Insertion", "10000");
            dataset.addValue(insertion.getTempo100000(), "Insertion", "100000");

            JFreeChart chart = ChartFactory.createLineChart(
                    "Comparação de Algoritmos",
                    "Quantidade de elementos",
                    "Tempo (ms)",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true,
                    true,
                    false);

            chart.setBackgroundPaint(Color.gray);
            chart.getTitle().setPaint(Color.blue);
            CategoryPlot p = chart.getCategoryPlot();
            p.setForegroundAlpha(0.9f);
            p.setRangeGridlinePaint(Color.red);
            p.setDomainGridlinesVisible(true);
            p.setDomainGridlinePaint(Color.black);

            CategoryItemRenderer renderer =  p.getRenderer();
            renderer.setSeriesPaint(0, Color.red);
            renderer.setSeriesPaint(1, Color.green);
            renderer.setSeriesPaint(2, Color.blue);
            renderer.setSeriesPaint(3, Color.yellow);

            renderer.setSeriesStroke( 0, new BasicStroke( 5 ) );
            renderer.setSeriesStroke( 1, new BasicStroke( 5 ) );
            renderer.setSeriesStroke( 2, new BasicStroke( 5 ) );
            renderer.setSeriesStroke( 3, new BasicStroke( 5 ) );

            ChartFrame frame1 = new ChartFrame("Gráfico de linhas", chart);
            frame1.setVisible(true);
            frame1.setSize(1300, 1000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void bubbleSort(int[] bubbleArray) {

        boolean troca;

        for (int i = 0; i < (bubbleArray.length - 1); i++) {
            troca = false;

            for (int j = 0; j < (bubbleArray.length - i - 1); j++) {

                if (bubbleArray[j] > bubbleArray[j + 1]) {

                    int aux = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = aux;

                    troca = true;
                }

            }

            if (!troca) {
                break;
            }
        }
    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public static void insercaoSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
            {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }

    public static void selecaoSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
    }

    public static int[] geraArray(int tamanho) {

        int [] arrayGerado = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            arrayGerado[i] = new Random().nextInt(tamanho + 1);
        }

        return arrayGerado;
    }

    public static int[] copiaArray(int[] array) {

        int [] arrayCopiado = new int[array.length];

        System.arraycopy(array, 0, arrayCopiado, 0, array.length);

        return arrayCopiado;
    }

    public static void printaArray(String nomeArray, int[] array) {
        System.out.print(nomeArray + " -> ");

        for (int j : array) {

            System.out.printf("%d ", j);

        }

    }

}

