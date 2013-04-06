__author__ = 'Aristide'

class Employee:

    def __init__(self, first_name, last_name):
        self._first_name = first_name;
        self._last_name = last_name;


    def show_id(self):
        return self._first_name + " " + self._last_name




class Office:

    def __init__(self):
        self._occupants = []
        self._position = 0


    def add(self, employee):
        self._occupants.append(employee)


    def __iter__(self):
        self._position = 0
        return self


    def next(self):
        if self._position < len(self._occupants):
            value = self._occupants[self._position]
            self._position += 1
            return value

        raise StopIteration




def iterator_test():

    scranton = Office()

    print "Test next \n"
    scranton.add(Employee("Michael", "Scott"))
    print(scranton.next().show_id())

    print "\nTest for each \n"
    scranton.add(Employee("Dwight", "Schrute"))
    scranton.add(Employee("Jim", "Halpert"))

    for i in scranton:
        print i.show_id()



if __name__ == "__main__":
    iterator_test()