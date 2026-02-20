def evenOdd(arr):
  even=[]
  odd=[]
  for i in arr:
    if(i%2==0):
      even.append(i)
    else:
      odd.append(i)
  print("Even values: ", even, " and odd values: ", odd)
  return 0

arr=[1,2,3,4,5,6,7]

evenOdd(arr)
