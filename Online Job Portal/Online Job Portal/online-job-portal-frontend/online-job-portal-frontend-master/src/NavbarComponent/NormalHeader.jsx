import { Link } from "react-router-dom";

const NormalHeader = () => {
  return (
    <ul class="navbar-nav ms-auto mb-2 mb-lg-0 me-5">
      <li class="nav-item">
        <Link
          to="/user/employer/register"
          class="nav-link active"
          aria-current="page"
        >
          <b className="text-color">Enregistrer un employeur</b>
        </Link>
      </li>

      <li class="nav-item">
        <Link
          to="/user/employee/register"
          class="nav-link active"
          aria-current="page"
        >
          <b className="text-color">Enregistrer Employee</b>
        </Link>
      </li>

      <li class="nav-item">
        <Link to="/user/login" class="nav-link active" aria-current="page">
          <b className="text-color">connexion</b>
        </Link>
      </li>
    </ul>
  );
};

export default NormalHeader;
