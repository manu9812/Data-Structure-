#include <stdio.h>
#include <stdlib.h>

int main()
{

  // determine the size of the vector 
    int x;
     printf("Digit the size of the vector: ");scanf("%i",&x);

       
        int a[x][x];
        int i = 0, j = 0, k = 0;
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                printf("I rig number in the position [",i,"][",j,"]:");
                scanf("%i",&a[i][j]);
                
            }
        }
        
        //determine if the entered numbers are couples or odd 
        for (i = 0; i < x; i++) {
            for (j = 0; j <x; j++) {
                printf("%i",a[i][j]);
            }
            
        }
        printf("\n");
       printf("The even numbers are: ");
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                if (a[i][j] % 2 == 0) {
                    printf("%i\n",a[i][j]);

                }
            }    
        }
        printf("The odd numbers are: ");
         for (i = 0; i <x; i++) {
            for (j = 0; j <x; j++) {
        
        
            
                if (a[i][j]%2!=0){
                    printf( "%i\n", a[i][j]);
                }
                    
            }
               
        }
        
        //determine if a number is positive or negative
         printf("The positive numbers are: ");
          for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
        
        
            
                if (a[i][j]>0){
                    printf( "%i\n", a[i][j]);
                }
                    
            }
               
        }
          printf("The negative numbers are: ");
          for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
        
        
            
                if (a[i][j]<0){
                    
                    printf("%i\n", a[i][j]);
                }
                    
            }
               
        }
  
 system("PAUSE");
  return 0;
}
