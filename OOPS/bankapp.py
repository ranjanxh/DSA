class bankAccount:
  def __init__(self,owner,balance=0):
    self.owner=owner
    self.balance=balance

  def deposit(self,amount):
    self.balance+=amount
    print(f"{self.owner} deposited to the account. Current balance is Rs.{self.balance}.")
  def withdraw(self,amount):
    self.balance-=amount

          
        
account1=bankAccount("Himanshu",5000)
account1.deposit(10000)
