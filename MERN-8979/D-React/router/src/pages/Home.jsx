import React from "react";

const Home = () => {
  return (
    <div className="container mt-5">
      <div className="row align-items-center">
        
        {/* Left Content */}
        <div className="col-md-6 mb-4">
          <h1 className="fw-bold mb-3">Welcome to Our Website</h1>
          <p className="text-muted mb-4">
            This is a simple home page built using React and Bootstrap.
            You can navigate through different pages using the navbar above.
          </p>

          <button className="btn btn-primary me-3">
            Get Started
          </button>
          <button className="btn btn-outline-secondary">
            Learn More
          </button>
        </div>

        {/* Right Content */}
        <div className="col-md-6 text-center">
          <div className="p-5 bg-light rounded">
            <h4 className="mb-3">Why Choose Us?</h4>
            <ul className="list-group list-group-flush">
              <li className="list-group-item">Fast Development</li>
              <li className="list-group-item">Modern UI</li>
              <li className="list-group-item">Responsive Design</li>
            </ul>
          </div>
        </div>

      </div>
    </div>
  );
};

export default Home;
