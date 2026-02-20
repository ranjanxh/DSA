class Car:
  def __init__(self,windows,doors,engine):
    self.windows=windows
    self.doors=doors
    self.engine=engine
    
  def drive(self):
    print(f"The person will drive the {self.engine} car")

car1=Car(4,5,"petrol")
car1.drive()

class Tesla(Car):
  def __init__(self, windows, doors, engine,is_selfdriving):
    super().__init__(windows, doors, engine)
    self.is_selfdriving=is_selfdriving
  def selfDriving(self):
    print(f"Tesla supports self driving: {self.is_selfdriving}")

Tesla1=Tesla(4,5,"diesel",True)
Tesla1.selfDriving()
Tesla1.drive()

class mine(Car,Tesla):
  def __init__(self, windows, doors, engine,is_selfdriving):
    super().__init__(windows, doors, engine,is_selfdriving)
