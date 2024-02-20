package Ordenamiento;

public class Sort
{
    private int array[];
    public Sort() { }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] bubble_sort()
    {
        int aux= 0;

        for(int i=0; i<array.length-1;i++)
        {
            for(int j=0; j<array.length-1;j++)
            {
                if(array[j] > array[j+1])
                {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }

        return array;
    }

    public int[] selection_sort()
    {
        int aux = 0, posicion = 0;
        boolean movimientos = false;

        for(int i = 0; i< array.length; i++)
        {
            aux = array[i];

            for(int j = i; j<array.length; j++)
            {
                if(array[j] < aux)
                {
                    aux = array[j];
                    posicion = j;
                    movimientos = true;
                }
            }
            if(movimientos)
            {
                array[posicion] = array[i];
                array[i] = aux;
            }
            movimientos = false;
        }

        return array;
    }

    public int[] insertion_sort()
    {
        int aux = 0, j = 0;

        for(int i = 1; i<array.length-1; i++)
        {
            aux = array[i];
            j = i-1;
            while(j>= 0 && array[j] > aux)
            {
                array[j+1] = array[j];
                array[j] = aux;
                j--;
            }
        }

        return array;
    }

    public int[] display_array()
    {
        for(int i = 0; i< array.length; i++)
            System.out.print(array[i]+" ");

        return array;
    }
}
