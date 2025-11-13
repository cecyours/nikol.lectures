const UserCard = ({ name, age }) => {
  return (
    <div className="card">
      <h1>
        Hello , {name} you are at your {age}{" "}
      </h1>
    </div>
  );
};

export default UserCard;
