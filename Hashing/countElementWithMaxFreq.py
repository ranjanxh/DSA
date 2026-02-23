class Solution:
    def maxFrequencyElements(self, nums):
        hash=[0 for i in range(len(nums)+1)]
        for i in nums:
            hash[i]+=1
        maximum=0
        for j in range(len(hash)):
            if(hash[j]>maximum):
                maximum=hash[j]
        count=0
        for z in hash:
            if(z==maximum):
                count+=z
        return count
x=Solution()
arr=[1,2,3,4,5]
print(x.maxFrequencyElements(arr))
