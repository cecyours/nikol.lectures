import React from "react";

const About = () => {
  return (
    <div className="container mt-5">
      
      {/* Page Heading */}
      <div className="row mb-4">
        <div className="col text-center">
          <h1 className="fw-bold">About Us</h1>
          <p className="text-muted">
            Learn more about who we are and what we do
          </p>
        </div>
      </div>

      {/* Content Section */}
      <div className="row align-items-center">
        
        {/* Left Content */}
        <div className="col-md-6 mb-4">
          <h3 className="mb-3">Who We Are</h3>
          <p className="text-muted">
            We are a team focused on building modern and responsive web
            applications using the latest technologies. Our goal is to
            deliver clean, scalable, and user-friendly solutions.
          </p>
          <p className="text-muted">
            With a strong foundation in frontend and backend development,
            we ensure performance, quality, and great user experience.
          </p>
        </div>

        {/* Right Content */}
        <div className="col-md-6">
          <div className="p-4 bg-light rounded">
            <h4 className="mb-3">Our Values</h4>
            <ul className="list-group list-group-flush">
              <li className="list-group-item">Quality Code</li>
              <li className="list-group-item">User-Centered Design</li>
              <li className="list-group-item">Continuous Learning</li>
              <li className="list-group-item">Team Collaboration</li>
            </ul>
          </div>
        </div>

      </div>
    </div>
  );
};

export default About;
