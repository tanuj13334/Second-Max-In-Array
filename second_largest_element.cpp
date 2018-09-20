/* Function to return the second largest elements */

int return2largest(vector<int> arr)
{
	int arr_size = arr.size();
       int first = INT_MIN;
	int second = INT_MIN;
 
        /* There should be atleast two elements */
        if (arr_size < 2)
        {
           return -1;
        }
	
        for (int i = 0; i < arr_size ; i ++)
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
            return -1;
        else
            return second;
}
