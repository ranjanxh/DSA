list1=[x for x in range(0,11) if x%2==0]
print(list1)
list2=[x for x in range(0,11,3)]
print(list2)

def getSmaller(arr,n):
  return [x for x in arr if x<n]

print(getSmaller(list1,5))