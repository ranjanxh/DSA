class Solution:
    def rearrangeArray(self, nums):
        positive=[]
        negative=[]
        for i in range(len(nums)):
            if(nums[i]>0):
                positive.append(nums[i])
            else:
                negative.append(nums[i])
        if(len(positive)>0):
            nums[0]=positive[0]
        for i in range(1,len(nums)-1,2):
            nums[i]=negative[i//2]
            nums[i+1]=positive[(i+1)//2]

        return nums

arr=[3,1,-2,-5,2,-4]
sol=Solution()
print(sol.rearrangeArray(arr))
