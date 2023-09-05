
# single : A->B
# multi-level A->B->C
# multiple : A->C, B->C


class Falcon:
    def __init__(self) -> None:
        print("i am falcon")

class Captain:
    def __init__(self) -> None:
        print("i am Captain")


class NewCaptain(Captain,Falcon):
    def __init__(self) -> None:
        print("i am cap.")


n = NewCaptain()


