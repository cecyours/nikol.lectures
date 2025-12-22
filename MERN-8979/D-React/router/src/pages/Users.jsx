import React, { useEffect, useState } from "react";
import { Link } from "react-router";

const Users = () => {
  const [users, setusers] = useState([]);

  const fetchUser = async () => {
    try {
      const res = await fetch("https://jsonplaceholder.typicode.com/users");

      setusers(await res.json());
    } catch (error) {}
  };

  useEffect(() => {
    fetchUser();
  }, []);

  return (
    <div className="row ">
      {users.map((user) => (
        <div className="col-3">
          <div class="card" style={{ width: "18rem" }}>
            <div class="card-body">
              <h5 class="card-title">{user.name}</h5>
              <p class="card-text">
                {user.address.street} , {user.address.city} ,{" "}
                {user.address.zipcode}
              </p>
              <Link to={`/users/${user.id}`}> view more</Link>
            </div>
          </div>
        </div>
      ))}
    </div>
  );
};

export default Users;
