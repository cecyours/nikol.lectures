const Navbar = () => {
  const isAdmin = true;
  const name = "devang";

  return (
    <>
      <ul>
        <li>Home</li>
        <li>About</li>
        <li>service</li>
        <li> {isAdmin ? name : "Plase log in first"} </li>
      </ul>
    </>
  );
};

export default Navbar;
