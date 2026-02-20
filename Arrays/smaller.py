def smaller(arr,n):
  small=[]
  for i in arr:
    if(i<n):
      small.append(i)
  return small

arr=[1,2,3,4,5,6,7,8,9]
print(smaller(arr,5))
