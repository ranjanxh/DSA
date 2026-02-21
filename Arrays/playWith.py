class Solution:
    def formatArray(self, arr):
        #code here
        for i in range(len(arr)-1):
            if(i%2==0):
                if(arr[i]>arr[i+1]):
                    arr[i],arr[i+1]=arr[i+1],arr[i]
                    
        return arr
arr=[5,4,3,2,1]
obj=Solution()
print(obj.formatArray(arr))