/* Function to return the second largest elements */

int return2largest(int arr[])
{
	int arr_size = arr.size();
    int i, first, second;
 
    /* There should be atleast two elements */
    if (arr_size < 2)
    {
        printf(" Invalid Input ");
        return;
    }
 
    first = second = INT_MIN;
    for (i = 0; i < arr_size ; i ++)
    {
        /* If current element is smaller than first
           then update both first and second */
        if (arr[i] > first)
        {
            second = first;
            first = arr[i];
        }
 
        /* If arr[i] is in between first and 
           second then update second  */
        else if (arr[i] > second && arr[i] != first)
            second = arr[i];
    }
    if (second == INT_MIN)
        printf("There is no second largest element\n");
    else
        printf("The second largest element is %dn", second);
}
