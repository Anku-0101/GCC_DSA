class Human:
    def __init__(xyz, Name, Age, Height):
        xyz.name__ = Name # self.name - Name present in class, Name coming by creating object
        xyz.age = Age
        xyz.Height = Height
    
    def getName(xyz):
        print("Name of person is = " + xyz.name__)
    
    def getAge(xyz):
        print("Age of person is = " , xyz.age)

Aman = Human("Aman", 22, 5.8)
#print(Aman.age)
#Aman.getName()

class circle:
    def __init__(self,radius):
        self.radius = radius
        
    def area(self):
        return 3.14 * self.radius**2
    
    def perimeter(self):
        return 2 * 3.14 * self.radius

c1 = circle(4)
#print(f"area of circle is {c1.area()} perimeter is {c1.perimeter()}")


class Library:
    def __init__(self, name):
        self.name = name # Library name
        self.__books = [] # List to store books

    def add_book(self, book_name): # Add a book to the list
        self.__books.append(book_name)
    
    def find(self, book_name): # Find a specific book
        if book_name in self.__books:
            return "Book is present in the library"
        else:
            return "Book not found"
    
    def remove(self, book):
        try:
            if book in self.__books:
                self.__books.remove(book)
            else:
                raise BookNotFoundError
        except Exception as e:
            print('Book', book ,'is not present to remove')
            
    def getAll(self): # Get all books in the library
        for book in self.__books:
            print(book)


my_lib = Library("City Library")
my_lib.add_book("Harry Potter")
my_lib.add_book("Basics of Python")
my_lib.add_book("AI with code")
my_lib.add_book("Machine learning Basics")
my_lib.remove("AI with code advanced")
print(my_lib.name)
#my_lib.books.append("xyz")
#print(my_lib.books)
print(my_lib.find("Advancements in AI"))
my_lib.getAll()



# Using dictionary to optimize the code, and adding more functionality like number of copies of a book

class library:
    
    def __init__(self):
        self.books = {}
    
    def add(self, book):
        if book in self.books:
            self.books[book] += 1
        else:
            self.books[book] = 1
    
    def remove(self, book):
        try:
            if book in self.books:
                if self.books[book] > 1:
                    self.books[book] -= 1
            else:
                self.books.pop(book)
            else:
                raise BookNotFoundError
        except Exception as e:
            print('Book is not present')


    def find(self, book):
        if book in self.books: # please check
            print('Book is present in library')
        else:
            print('Book is not present in library')


    def getall(self):
        print(self.books) # also make books dicitonary as private



my_library = library()
my_library.add('Harry Potter 1')
my_library.add('Lord Of The Rings')
my_library.add('Harry Potter 1')
my_library.remove('receipe book')
my_library.remove('Harry Potter 1')

my_library.find('Harry Potter 1')
my_library.getall() 





















