mat=[[1,2,3],[4,5,6],[7,8,9]]
print(mat)
#Take Matrix input from user in Python
rows=int(input("Enter rows:"))
col=int(input("Enter columns"))
matrix2=[]
for i in range(rows):
  row=[]
  for j in range(col):
    row.append(int(input()))
  matrix2.append(row)

for i in range(rows):
  for j in range(col):
    print(matrix2[i][j],end=" ")
  print()

#list comprehension
mat3=[[col for col in range(3)] for row in range(2) ]
print(mat3)
