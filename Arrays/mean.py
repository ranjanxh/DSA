def mean(arr):
  sum=0
  for i in arr:
    sum+=i
  n=len(arr)
  return sum//n

arr=[1,2,3,4,5,6,7]
print(mean(arr))