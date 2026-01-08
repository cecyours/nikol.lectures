import json

user_data = {
 "name": "John Doe",
 "age": 25,
 "email": "john@example.com",
 "active": True
}


json_string = json.dumps(user_data, indent=2)
print(json_string)


# Convert JSON string back to Python
parsed_data = json.loads(json_string)
print(f"\nParsed name: {parsed_data['name']}")



# Write JSON to file
with open('user.json', 'w') as f:
 json.dump(user_data, f, indent=2)


# Read JSON from file
with open('user.json', 'r') as f:
 loaded_data = json.load(f)
 print(f"\nLoaded email: {loaded_data['email']}")



