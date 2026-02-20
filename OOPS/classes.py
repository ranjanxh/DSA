class Dog:
  species="Canine"
  def __init__(self,name,age):
    self.name=name
    self.age=age
  def bark(self):
    print(f"{self.name} says woof")

puppy=Dog("Buddy",3)
print(puppy)
puppy.bark()