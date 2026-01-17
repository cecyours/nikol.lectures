import requests

res = requests.get('https://jsonplaceholder.typicode.com/users')

if res.status_code == 200:
    data = res.json()
    print(f"here is data {data}")
    
