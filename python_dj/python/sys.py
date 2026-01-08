import sys

print(sys.path)


# Get command-line arguments
print(f"Script name: {sys.argv[0]}")
print(f"Arguments: {sys.argv[1:]}")

print(sys.version)


if len(sys.argv) < 2:
    print("Error: No arguments provided")
    sys.exit(1)

