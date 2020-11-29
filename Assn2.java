import java.util.Random;

public class Assn2 {
    Random rd = new Random();
    int r = rd.nextInt(100);
    int[] a1 = new int[100];
    int[] a2 = new int[100];
    int[] a3 = new int[100];

    int[] createArray(int[] array){
        int i = 0;
        while(i < 100){
            int j = rd.nextInt(100);
            array[i] = j;
            i++;
        }
        return array;
    }

    public int findKth(int k, int[] a){
        int x = 0,y = 0,z = 0;

        if(a.length == 1){
            return a[0];
        }
        else {
            for(int b = 0; b < a.length-1; b++){
                if(a[b] > r) {
                    a1[x] = a[b];
                    x++;
                }
                else if(a[b] < r){
                    a3[z] = a[b];
                    z++;
                }
                else{
                    a2[y] = a[b];
                    y++;
                }
            }
            int f = 0, g = 0, h = 0;
            for(f = 0; f < a1.length; f++){
                if(a1[f] == 0)
                    break;
                else
                    ;
            }
            for(g = 0; g < a2.length; g++){
                if(a2[g] == 0)
                    break;
                else
                    ;
            }
            if(f >= k)
                return findKth(k, a1);
            else{
                if(f+g >= k){
                    return r;
                }
                else
                    return findKth(k - (f - g), a3);
            }
        }
    }
    public int findKth2(int k, int[] a){

        int z = a.length;

        if(z < 50){
            Arrays.sort(a);
            return a[k-1];
        }
        else {
            int f = 0, g = 0;
            for(f = 0; f < a1.length; f++){
                if(a1[f] == 0)
                    break;
                else
                    ;
            }
            for(g = 0; g < a2.length; g++){
                if(a2[g] == 0)
                    break;
                else
                    ;
            }
            if(f >= k)
                return findKth2(k, a1);
            else{
                if((f+g) >= k)
                    return a[k];
                else{
                    return a3[k-(f-g)];
                }
            }
        }
    }
}
