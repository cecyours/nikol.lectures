const Navbar = () => {
  const isAdmin = true;
  const name = "devang";

  return (
    <nav className="navbar">
      <ul className="nav-list">
        <li className="nav-item">Home</li>
        <li className="nav-item">About</li>
        <li className="nav-item">Service</li>
        <li className="nav-item user-name">
          {isAdmin ? name : "Please log in first"}
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;
