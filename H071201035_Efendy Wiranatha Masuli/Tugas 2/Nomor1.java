import java.util.Scanner;

class Nomor1 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int a,b,c,d,e,negatif=0,positif=0,ganjil=0,genap=0;
        try
        {
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            d = scan.nextInt();
            e = scan.nextInt();

            if (a<=0)
            {
                if (a<0)
                    negatif++;
                if(a%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(a%2==0)
                    genap++;
                else
                    ganjil++;
            }

            if (b<=0)
            {
                if (b<0)
                negatif++;
                if(b%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(b%2==0)
                    genap++;
                else
                    ganjil++;
            }

            if (c<=0)
            {
                if (c<0)
                negatif++;
                if(c%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(c%2==0)
                    genap++;
                else
                    ganjil++;
            }

            if (d<=0)
            {
                if (d<0)
                negatif++;
                if(d%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(d%2==0)
                    genap++;
                else
                    ganjil++;
            }

            if (e<=0)
            {
                if (e<0)
                negatif++;
                if(e%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(e%2==0)
                    genap++;
                else
                    ganjil++;
            }
        
            System.out.printf("jumlah bilangan positif = %d \n",positif);
            System.out.printf("jumlah bilangan negatif = %d \n",negatif);
            System.out.printf("jumlah bilangan ganjil = %d \n",ganjil);
            System.out.printf("jumlah bilangan genap = %d",genap);
        }          
        catch (Exception er) 
        {
            System.out.println("Inputan Tidak Valid");
        }
    }
}
