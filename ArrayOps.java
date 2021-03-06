public class ArrayOps {

public static int sum(int[] arr) {
int sum = 0;
for(int i=0; i<arr.length; i++)
{sum += arr[i];}
return sum;
}

public static  int largest(int[]arr) {
int number = 0;
for (int i=0; i < arr.length; i++)
{if (arr[i] > number)
number = arr[i];}
return number;}



public static int[] sumRows(int[][] matrix) {
int [] result = new int [matrix.length];
for (int x =0; x < matrix.length; x ++) {

result[x] =  sum(matrix[x]);
}

return result;}



public static  int[] largestInRows(int[][] matrix){
int [] result = new int [matrix.length];
for (int x =0; x < matrix.length; x ++)
{ result [x] += largest (matrix [x] );
}

return result;}



public static  int sum(int[][] arr){
int sum = 0;
for (int x =0; x < arr.length; x ++)
{ sum += sum (arr[x]);
}
return sum;}

public static int[] sumCols(int[][] matrix) {
int [] result = new int [matrix[0].length];
int sum = 0;
for (int x = 0; x < matrix[0].length; x ++) {
sum = 0;
for (int y =0; y < matrix.length; y ++) {
sum += matrix[y][x];
result [x] = sum;}
}

return result;}


public static boolean isRowMagic(int[][] matrix)
{
for (int i = 0; i < matrix.length-1; i++){
if (sum (matrix[i]) != sum(matrix[i + 1]))
return false;}
return true;}

public static boolean isColMagic(int[][] matrix){ 
int [] result =  sumCols (matrix);

for (int i=0; i<result.length -1; i++)

{if (result [i] != result[i +1])
return false;
}
return true;
}


public static boolean isLocationMagic(int[][] matrix, int row, int col){
int [] nrow = matrix [row];
int [] ncolumn = sumCols(matrix);
int newrow = sum(nrow);
int newcolumn = ncolumn[col]; 
{
if (newrow == newcolumn)
return true;
return false;}

}}
